package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Award: ImageVector
    get() {
        val current = _award
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Award",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.67f, dy1 = -0.41f)
                lineTo(x = 5.6f, y = 19.6f)
                curveToRelative(dx1 = -1.96f, dy1 = -1.32f, dx2 = -2.09f, dy2 = -1.56f, dx3 = -2.09f, dy3 = -3.63f)
                verticalLineToRelative(dy = -4.96f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.07f, dx2 = 0.13f, dy2 = -2.31f, dx3 = 2.05f, dy3 = -3.6f)
                lineToRelative(dx = 4.78f, dy = -2.76f)
                arcToRelative(a = 3.6f, b = 3.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.33f, dy1 = 0.0f)
                lineToRelative(dx = 4.73f, dy = 2.73f)
                curveToRelative(dx1 = 1.96f, dy1 = 1.32f, dx2 = 2.1f, dy2 = 1.56f, dx3 = 2.1f, dy3 = 3.63f)
                verticalLineToRelative(dy = 4.96f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.07f, dx2 = -0.14f, dy2 = 2.3f, dx3 = -2.06f, dy3 = 3.6f)
                lineToRelative(dx = -4.78f, dy = 2.76f)
                arcToRelative(a = 3.3f, b = 3.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.66f, dy1 = 0.4f)
                moveToRelative(dx = 0.0f, dy = -17.0f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.92f, dy1 = 0.2f)
                lineTo(x = 6.35f, y = 8.7f)
                curveToRelative(dx1 = -1.34f, dy1 = 0.9f, dx2 = -1.34f, dy2 = 0.9f, dx3 = -1.34f, dy3 = 2.33f)
                verticalLineToRelative(dy = 4.96f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.42f, dx2 = 0.0f, dy2 = 1.42f, dx3 = 1.4f, dy3 = 2.36f)
                lineToRelative(dx = 4.68f, dy = 2.7f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.83f, dy1 = 0.0f)
                lineToRelative(dx = 4.73f, dy = -2.73f)
                curveTo(x1 = 19.0f, y1 = 17.4f, x2 = 19.0f, y2 = 17.4f, x3 = 19.0f, y3 = 15.98f)
                verticalLineToRelative(dy = -4.96f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.42f, dx2 = 0.0f, dy2 = -1.42f, dx3 = -1.39f, dy3 = -2.36f)
                lineToRelative(dx = -4.69f, dy = -2.7f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.9f, dy1 = -0.21f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.5f, y = 8.38f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.58f, dx2 = -0.67f, dy2 = -2.25f, dx3 = -2.25f, dy3 = -2.25f)
                horizontalLineToRelative(dx = -5.0f)
                curveTo(x1 = 7.92f, y1 = 2.75f, x2 = 7.25f, y2 = 3.42f, x3 = 7.25f, y3 = 5.0f)
                verticalLineToRelative(dy = 2.56f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -1.5f, dy1 = 0.0f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = 1.33f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 2.42f, dy1 = 0.0f, dx2 = 3.75f, dy2 = 1.33f, dx3 = 3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 2.63f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.75f)
                moveToRelative(dx = -3.87f, dy = 9.25f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.65f, dy1 = -0.13f)
                lineTo(x = 12.0f, y = 17.12f)
                lineToRelative(dx = -0.98f, dy = 0.4f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.47f, dy1 = -0.14f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = -1.36f)
                lineToRelative(dx = 0.06f, dy = -1.05f)
                lineToRelative(dx = -0.67f, dy = -0.8f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.32f, dy1 = -1.46f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.1f, dy1 = -0.97f)
                lineToRelative(dx = 1.03f, dy = -0.26f)
                lineToRelative(dx = 0.57f, dy = -0.89f)
                arcToRelative(a = 1.47f, b = 1.47f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.53f, dy1 = 0.0f)
                lineToRelative(dx = 0.57f, dy = 0.9f)
                lineToRelative(dx = 1.02f, dy = 0.25f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.1f, dy1 = 0.97f)
                arcToRelative(a = 1.5f, b = 1.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.32f, dy1 = 1.44f)
                lineToRelative(dx = -0.67f, dy = 0.81f)
                lineToRelative(dx = 0.06f, dy = 1.05f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.58f, dy1 = 1.36f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.82f, dy1 = 0.26f)
                moveTo(x = 9.52f, y = 13.2f)
                lineToRelative(dx = 0.67f, dy = 0.81f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = 1.05f)
                lineToRelative(dx = -0.06f, dy = 1.05f)
                lineToRelative(dx = 0.98f, dy = -0.39f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.1f, dy1 = 0.0f)
                lineToRelative(dx = 0.98f, dy = 0.4f)
                lineToRelative(dx = -0.06f, dy = -1.06f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.34f, dy1 = -1.05f)
                lineToRelative(dx = 0.67f, dy = -0.8f)
                lineToRelative(dx = -1.02f, dy = -0.27f)
                arcToRelative(a = 1.7f, b = 1.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -0.64f)
                lineToRelative(dx = -0.55f, dy = -0.88f)
                lineToRelative(dx = -0.57f, dy = 0.88f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = 0.65f)
                close()
            }
        }.build().also { _award = it }
    }

@Suppress("ObjectPropertyName")
private var _award: ImageVector? = null
