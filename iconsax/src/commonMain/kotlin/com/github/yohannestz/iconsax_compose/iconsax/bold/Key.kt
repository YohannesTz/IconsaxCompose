package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Key: ImageVector
    get() {
        val current = _key
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Key",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.79f, y = 4.22f)
                arcToRelative(a = 7.57f, b = 7.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -12.6f, dy1 = 7.6f)
                lineToRelative(dx = -4.7f, dy = 4.7f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = 1.49f)
                lineToRelative(dx = 0.3f, dy = 2.18f)
                arcToRelative(a = 1.9f, b = 1.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.5f, dy1 = 1.5f)
                lineToRelative(dx = 2.18f, dy = 0.3f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.49f, dy1 = -0.5f)
                lineToRelative(dx = 0.82f, dy = -0.82f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -0.71f)
                lineToRelative(dx = -1.94f, dy = -1.94f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                lineToRelative(dx = 1.95f, dy = 1.95f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.7f, dy1 = 0.0f)
                lineToRelative(dx = 2.12f, dy = -2.11f)
                arcToRelative(a = 7.57f, b = 7.57f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 7.6f, dy1 = -12.58f)
                moveTo(x = 14.49f, y = 12.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 5.0f)
            }
        }.build().also { _key = it }
    }

@Suppress("ObjectPropertyName")
private var _key: ImageVector? = null
