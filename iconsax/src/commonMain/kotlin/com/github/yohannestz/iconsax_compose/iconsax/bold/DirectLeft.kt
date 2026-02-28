package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DirectLeft: ImageVector
    get() {
        val current = _directLeft
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DirectLeft",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.3f, y = 17.02f)
                lineToRelative(dx = -1.75f, dy = -3.48f)
                arcToRelative(a = 3.5f, b = 3.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -3.07f)
                lineTo(x = 21.3f, y = 7.0f)
                arcToRelative(a = 3.43f, b = 3.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.67f, dy1 = -4.57f)
                lineToRelative(dx = -1.54f, dy = 0.82f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.48f, dy1 = 0.51f)
                lineTo(x = 8.9f, y = 16.4f)
                arcToRelative(a = 1.1f, b = 1.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.48f, dy1 = 1.4f)
                lineToRelative(dx = 7.24f, dy = 3.8f)
                arcToRelative(a = 3.43f, b = 3.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.67f, dy1 = -4.57f)
                moveTo(x = 7.68f, y = 15.6f)
                lineToRelative(dx = 3.73f, dy = -8.28f)
                curveToRelative(dx1 = 0.42f, dy1 = -0.93f, dx2 = -0.58f, dy2 = -1.87f, dx3 = -1.48f, dy3 = -1.39f)
                lineTo(x = 4.17f, y = 8.96f)
                arcToRelative(a = 3.43f, b = 3.43f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 6.08f)
                lineToRelative(dx = 2.04f, dy = 1.07f)
                arcToRelative(a = 1.07f, b = 1.07f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.48f, dy1 = -0.51f)
            }
        }.build().also { _directLeft = it }
    }

@Suppress("ObjectPropertyName")
private var _directLeft: ImageVector? = null
