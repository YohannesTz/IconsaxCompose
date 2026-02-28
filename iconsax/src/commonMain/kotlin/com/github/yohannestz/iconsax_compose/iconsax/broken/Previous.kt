package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Previous: ImageVector
    get() {
        val current = _previous
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Previous",
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
                moveTo(x = 12.27f, y = 7.4f)
                lineTo(x = 16.42f, y = 5.0f)
                arcToRelative(a = 2.55f, b = 2.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.83f, dy1 = 2.21f)
                verticalLineToRelative(dy = 9.57f)
                arcTo(horizontalEllipseRadius = 2.56f, verticalEllipseRadius = 2.56f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.42f, y1 = 19.0f)
                lineToRelative(dx = -4.15f, dy = -2.39f)
                lineToRelative(dx = -4.15f, dy = -2.4f)
                arcToRelative(a = 2.54f, b = 2.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.4f)
                moveToRelative(dx = -4.36f, dy = 8.38f)
                verticalLineTo(y = 17.0f)
                moveToRelative(dx = 0.0f, dy = -3.0f)
                verticalLineTo(y = 5.82f)
            }
        }.build().also { _previous = it }
    }

@Suppress("ObjectPropertyName")
private var _previous: ImageVector? = null
