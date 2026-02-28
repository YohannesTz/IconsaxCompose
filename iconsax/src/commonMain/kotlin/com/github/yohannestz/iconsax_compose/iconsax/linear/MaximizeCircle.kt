package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MaximizeCircle: ImageVector
    get() {
        val current = _maximizeCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MaximizeCircle",
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
                moveTo(x = 17.0f, y = 3.0f)
                horizontalLineToRelative(dx = 4.0f)
                verticalLineToRelative(dy = 4.0f)
                moveToRelative(dx = -6.0f, dy = 2.0f)
                lineToRelative(dx = 6.0f, dy = -6.0f)
                moveTo(x = 7.0f, y = 21.0f)
                horizontalLineTo(x = 3.0f)
                verticalLineToRelative(dy = -4.0f)
                moveToRelative(dx = 6.0f, dy = -2.0f)
                lineToRelative(dx = -6.0f, dy = 6.0f)
                moveTo(x = 14.02f, y = 2.2f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 2.2f, y1 = 14.0f)
                moveToRelative(dx = 7.78f, dy = 7.8f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 21.8f, y1 = 10.0f)
            }
        }.build().also { _maximizeCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _maximizeCircle: ImageVector? = null
