package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val AttachCircle: ImageVector
    get() {
        val current = _attachCircle
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.AttachCircle",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 12.0f, y = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = -20.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 20.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.2f, y = 17.38f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.75f, dy1 = -2.74f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.81f, dy1 = -1.94f)
                lineToRelative(dx = 1.41f, dy = -1.4f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.05f)
                lineToRelative(dx = -1.4f, dy = 1.41f)
                arcToRelative(a = 1.23f, b = 1.23f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.76f)
                arcToRelative(a = 1.25f, b = 1.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.76f, dy1 = 0.0f)
                lineToRelative(dx = 2.22f, dy = -2.22f)
                arcToRelative(a = 3.25f, b = 3.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.6f, dy1 = -4.6f)
                lineTo(x = 8.3f, y = 11.12f)
                arcToRelative(a = 2.66f, b = 2.66f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.78f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.06f, dy1 = 0.0f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 6.01f, y1 = 13.0f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.22f, dy1 = -2.96f)
                lineToRelative(dx = 2.42f, dy = -2.42f)
                arcToRelative(a = 4.76f, b = 4.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 6.72f, dy1 = 0.0f)
                arcToRelative(a = 4.76f, b = 4.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.72f)
                lineToRelative(dx = -2.22f, dy = 2.22f)
                arcToRelative(a = 2.7f, b = 2.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.95f, dy1 = 0.82f)
            }
        }.build().also { _attachCircle = it }
    }

@Suppress("ObjectPropertyName")
private var _attachCircle: ImageVector? = null
