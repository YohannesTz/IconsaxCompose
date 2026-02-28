package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Clipboard: ImageVector
    get() {
        val current = _clipboard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Clipboard",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.05f, y = 19.42f)
                quadToRelative(dx1 = -0.8f, dy1 = 0.0f, dx2 = -1.73f, dy2 = -0.15f)
                lineToRelative(dx = -4.69f, dy = -0.74f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.47f, dy1 = -1.24f)
                curveToRelative(dx1 = -2.19f, dy1 = -1.52f, dx2 = -2.06f, dy2 = -4.13f, dx3 = -1.78f, dy3 = -5.96f)
                lineToRelative(dx = 0.74f, dy = -4.69f)
                curveToRelative(dx1 = 0.68f, dy1 = -4.3f, dx2 = 2.9f, dy2 = -5.91f, dx3 = 7.2f, dy3 = -5.24f)
                lineToRelative(dx = 4.69f, dy = 0.74f)
                curveToRelative(dx1 = 2.21f, dy1 = 0.35f, dx2 = 5.18f, dy2 = 1.24f, dx3 = 5.37f, dy3 = 4.97f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.14f, dy1 = 2.23f)
                lineToRelative(dx = -0.73f, dy = 4.69f)
                curveToRelative(dx1 = -0.58f, dy1 = 3.67f, dx2 = -2.29f, dy2 = 5.39f, dx3 = -5.46f, dy3 = 5.39f)
                moveTo(x = 7.53f, y = 2.75f)
                curveToRelative(dx1 = -2.38f, dy1 = 0.0f, dx2 = -3.46f, dy2 = 1.21f, dx3 = -3.93f, dy3 = 4.13f)
                lineToRelative(dx = -0.74f, dy = 4.69f)
                curveToRelative(dx1 = -0.46f, dy1 = 2.95f, dx2 = 0.38f, dy2 = 3.95f, dx3 = 1.16f, dy3 = 4.5f)
                arcToRelative(a = 6.6f, b = 6.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.84f, dy1 = 0.98f)
                lineToRelative(dx = 4.69f, dy = 0.74f)
                curveToRelative(dx1 = 3.49f, dy1 = 0.55f, dx2 = 4.93f, dy2 = -0.5f, dx3 = 5.48f, dy3 = -4.0f)
                lineToRelative(dx = 0.73f, dy = -4.69f)
                quadToRelative(dx1 = 0.18f, dy1 = -1.12f, dx2 = 0.12f, dy2 = -1.91f)
                verticalLineTo(y = 7.18f)
                curveToRelative(dx1 = -0.11f, dy1 = -2.1f, dx2 = -1.3f, dy2 = -3.13f, dx3 = -4.11f, dy3 = -3.57f)
                lineTo(x = 9.09f, y = 2.88f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.56f, dy1 = -0.13f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.68f, y = 22.75f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.92f, dy1 = -0.55f)
                lineToRelative(dx = -4.5f, dy = -1.5f)
                curveToRelative(dx1 = -2.58f, dy1 = -0.85f, dx2 = -3.97f, dy2 = -2.07f, dx3 = -4.39f, dy3 = -3.85f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.31f, dy1 = -0.8f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.85f, dy1 = 0.02f)
                arcToRelative(a = 6.5f, b = 6.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.83f, dy1 = 0.98f)
                lineToRelative(dx = 4.7f, dy = 0.74f)
                curveToRelative(dx1 = 3.48f, dy1 = 0.55f, dx2 = 4.92f, dy2 = -0.5f, dx3 = 5.47f, dy3 = -4.0f)
                lineToRelative(dx = 0.73f, dy = -4.7f)
                quadToRelative(dx1 = 0.18f, dy1 = -1.1f, dx2 = 0.12f, dy2 = -1.9f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.35f, dy1 = -0.67f)
                arcTo(horizontalEllipseRadius = 0.7f, verticalEllipseRadius = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 19.0f, y1 = 6.49f)
                curveToRelative(dx1 = 2.68f, dy1 = 1.43f, dx2 = 3.4f, dy2 = 3.72f, dx3 = 2.23f, dy3 = 7.22f)
                lineToRelative(dx = -1.5f, dy = 4.5f)
                curveToRelative(dx1 = -0.7f, dy1 = 2.13f, dx2 = -1.64f, dy2 = 3.43f, dx3 = -2.94f, dy3 = 4.08f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.1f, dy1 = 0.46f)
                moveToRelative(dx = -8.95f, dy = -4.4f)
                arcToRelative(a = 8.0f, b = 8.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.0f, dy1 = 0.93f)
                lineToRelative(dx = 4.5f, dy = 1.5f)
                curveToRelative(dx1 = 1.72f, dy1 = 0.57f, dx2 = 2.95f, dy2 = 0.62f, dx3 = 3.87f, dy3 = 0.17f)
                curveToRelative(dx1 = 0.92f, dy1 = -0.46f, dx2 = 1.62f, dy2 = -1.48f, dx3 = 2.2f, dy3 = -3.2f)
                lineToRelative(dx = 1.5f, dy = -4.51f)
                curveToRelative(dx1 = 0.81f, dy1 = -2.48f, dx2 = 0.5f, dy2 = -3.8f, dx3 = -0.46f, dy3 = -4.7f)
                quadToRelative(dx1 = -0.03f, dy1 = 0.38f, dx2 = -0.1f, dy2 = 0.8f)
                lineToRelative(dx = -0.73f, dy = 4.69f)
                curveToRelative(dx1 = -0.68f, dy1 = 4.3f, dx2 = -2.9f, dy2 = 5.9f, dx3 = -7.2f, dy3 = 5.25f)
                lineToRelative(dx = -4.69f, dy = -0.74f)
                close()
                moveToRelative(dx = 2.51f, dy = -8.63f)
                arcToRelative(a = 2.49f, b = 2.49f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -4.98f)
                arcToRelative(a = 2.49f, b = 2.49f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 4.98f)
                moveToRelative(dx = 0.0f, dy = -3.47f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.98f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.98f)
            }
        }.build().also { _clipboard = it }
    }

@Suppress("ObjectPropertyName")
private var _clipboard: ImageVector? = null
