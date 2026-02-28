package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SunOne: ImageVector
    get() {
        val current = _sunOne
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SunOne",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 12.0f, y = 18.5f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -13.0f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 13.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineWidth = 2.0f,
            ) {
                moveTo(x = 19.14f, y = 19.14f)
                lineToRelative(dx = -0.13f, dy = -0.13f)
                moveToRelative(dx = 0.0f, dy = -14.02f)
                lineToRelative(dx = 0.13f, dy = -0.13f)
                close()
                moveTo(x = 4.86f, y = 19.14f)
                lineToRelative(dx = 0.13f, dy = -0.13f)
                close()
                moveTo(x = 12.0f, y = 2.08f)
                verticalLineTo(y = 2.0f)
                close()
                moveTo(x = 12.0f, y = 22.0f)
                verticalLineToRelative(dy = -0.08f)
                close()
                moveTo(x = 2.08f, y = 12.0f)
                horizontalLineTo(x = 2.0f)
                close()
                moveTo(x = 22.0f, y = 12.0f)
                horizontalLineToRelative(dx = -0.08f)
                close()
                moveTo(x = 4.99f, y = 4.99f)
                lineTo(x = 4.86f, y = 4.86f)
                close()
            }
        }.build().also { _sunOne = it }
    }

@Suppress("ObjectPropertyName")
private var _sunOne: ImageVector? = null
