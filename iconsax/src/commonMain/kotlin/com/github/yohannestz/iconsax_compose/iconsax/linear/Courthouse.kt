package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Courthouse: ImageVector
    get() {
        val current = _courthouse
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Courthouse",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 2.0f, y = 22.0f)
                horizontalLineToRelative(dx = 20.0f)
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 6.8f, b = 6.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.0f, dy1 = 0.0f)
                verticalLineToRelative(dy = 3.0f)
                arcToRelative(a = 6.8f, b = 6.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.0f, dy1 = 0.0f)
                close()
                moveToRelative(dx = 0.0f, dy = 3.0f)
                verticalLineToRelative(dy = 3.0f)
                moveToRelative(dx = 5.0f, dy = 0.0f)
                horizontalLineTo(x = 7.0f)
                quadToRelative(dx1 = -3.0f, dy1 = 0.0f, dx2 = -3.0f, dy2 = 3.0f)
                verticalLineToRelative(dy = 11.0f)
                horizontalLineToRelative(dx = 16.0f)
                verticalLineTo(y = 11.0f)
                quadToRelative(dx1 = 0.0f, dy1 = -3.0f, dx2 = -3.0f, dy2 = -3.0f)
                moveTo(x = 4.58f, y = 12.0f)
                horizontalLineToRelative(dx = 14.84f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 7.99f, y = 12.0f)
                verticalLineToRelative(dy = 10.0f)
                moveToRelative(dx = 4.0f, dy = -10.0f)
                verticalLineToRelative(dy = 10.0f)
                moveToRelative(dx = 4.0f, dy = -10.0f)
                verticalLineToRelative(dy = 10.0f)
            }
        }.build().also { _courthouse = it }
    }

@Suppress("ObjectPropertyName")
private var _courthouse: ImageVector? = null
