package com.github.yohannestz.iconsax_compose.iconsax.twotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Bill: ImageVector
    get() {
        val current = _bill
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Bill",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 3.67f, y = 2.5f)
                verticalLineToRelative(dy = 11.97f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.25f, dy1 = 2.5f)
                lineToRelative(dx = 5.21f, dy = 3.9f)
                arcToRelative(a = 3.14f, b = 3.14f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.75f, dy1 = 0.0f)
                lineToRelative(dx = 5.21f, dy = -3.9f)
                arcToRelative(a = 3.1f, b = 3.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.25f, dy1 = -2.5f)
                verticalLineTo(y = 2.5f)
                close()
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 2.5f)
                horizontalLineToRelative(dx = 20.0f)
            }
            path(
                fillAlpha = 0.4f,
                stroke = SolidColor(Color(0xFF292D32)),
                strokeAlpha = 0.4f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 8.0f, y = 8.0f)
                horizontalLineToRelative(dx = 8.0f)
                moveToRelative(dx = -8.0f, dy = 5.0f)
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _bill = it }
    }

@Suppress("ObjectPropertyName")
private var _bill: ImageVector? = null
