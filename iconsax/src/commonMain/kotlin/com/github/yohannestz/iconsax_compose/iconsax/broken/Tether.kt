package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tether: ImageVector
    get() {
        val current = _tether
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Tether",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF000000)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 18.1f, y = 16.22f)
                lineToRelative(dx = -4.02f, dy = 3.65f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.17f, dy1 = 0.0f)
                lineToRelative(dx = -6.93f, dy = -6.29f)
                arcTo(horizontalEllipseRadius = 3.3f, verticalEllipseRadius = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 2.29f, y1 = 9.9f)
                lineToRelative(dx = 2.4f, dy = -4.82f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.78f, dy1 = -1.72f)
                horizontalLineToRelative(dx = 9.06f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.78f, dy1 = 1.72f)
                lineToRelative(dx = 2.4f, dy = 4.82f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.69f, dy1 = 3.68f)
                moveTo(x = 12.0f, y = 14.5f)
                verticalLineToRelative(dy = -6.0f)
                moveToRelative(dx = -4.0f, dy = 0.0f)
                horizontalLineToRelative(dx = 8.0f)
            }
        }.build().also { _tether = it }
    }

@Suppress("ObjectPropertyName")
private var _tether: ImageVector? = null
