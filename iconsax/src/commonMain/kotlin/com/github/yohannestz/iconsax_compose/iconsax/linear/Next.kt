package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Next: ImageVector
    get() {
        val current = _next
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Next",
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
                moveTo(x = 3.76f, y = 7.22f)
                verticalLineToRelative(dy = 9.57f)
                arcTo(horizontalEllipseRadius = 2.56f, verticalEllipseRadius = 2.56f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 7.59f, y1 = 19.0f)
                lineToRelative(dx = 4.15f, dy = -2.39f)
                lineToRelative(dx = 4.15f, dy = -2.4f)
                arcToRelative(a = 2.54f, b = 2.54f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -4.41f)
                lineToRelative(dx = -4.15f, dy = -2.4f)
                lineToRelative(dx = -4.15f, dy = -2.39f)
                arcToRelative(a = 2.55f, b = 2.55f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.83f, dy1 = 2.21f)
                moveToRelative(dx = 16.48f, dy = 10.96f)
                verticalLineTo(y = 5.82f)
            }
        }.build().also { _next = it }
    }

@Suppress("ObjectPropertyName")
private var _next: ImageVector? = null
