package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val NotepadTwo: ImageVector
    get() {
        val current = _notepadTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.NotepadTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.68f, y = 19.96f)
                curveToRelative(dx1 = 0.27f, dy1 = 0.06f, dx2 = 0.3f, dy2 = 0.42f, dx3 = 0.03f, dy3 = 0.51f)
                lineTo(x = 11.13f, y = 21.0f)
                curveToRelative(dx1 = -3.97f, dy1 = 1.28f, dx2 = -6.06f, dy2 = 0.21f, dx3 = -7.35f, dy3 = -3.76f)
                lineTo(x = 2.5f, y = 13.28f)
                curveTo(x1 = 1.22f, y1 = 9.31f, x2 = 2.28f, y2 = 7.21f, x3 = 6.25f, y3 = 5.93f)
                lineToRelative(dx = 0.52f, dy = -0.17f)
                curveToRelative(dx1 = 0.4f, dy1 = -0.13f, dx2 = 0.8f, dy2 = 0.27f, dx3 = 0.68f, dy3 = 0.68f)
                lineTo(x = 7.3f, y = 7.07f)
                lineToRelative(dx = -0.98f, dy = 4.2f)
                curveToRelative(dx1 = -1.1f, dy1 = 4.7f, dx2 = 0.5f, dy2 = 7.3f, dx3 = 5.22f, dy3 = 8.42f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.17f, y = 3.2f)
                lineTo(x = 15.5f, y = 2.83f)
                curveTo(x1 = 12.16f, y1 = 2.02f, x2 = 10.17f, y2 = 2.68f, x3 = 9.0f, y3 = 5.1f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.74f, dy1 = 2.2f)
                lineToRelative(dx = -0.98f, dy = 4.19f)
                curveToRelative(dx1 = -0.98f, dy1 = 4.18f, dx2 = 0.31f, dy2 = 6.24f, dx3 = 4.48f, dy3 = 7.23f)
                lineToRelative(dx = 1.68f, dy = 0.4f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.62f, dy1 = 0.27f)
                curveToRelative(dx1 = 3.12f, dy1 = 0.3f, dx2 = 4.78f, dy2 = -1.16f, dx3 = 5.62f, dy3 = -4.77f)
                lineToRelative(dx = 0.98f, dy = -4.18f)
                curveToRelative(dx1 = 0.98f, dy1 = -4.18f, dx2 = -0.3f, dy2 = -6.25f, dx3 = -4.49f, dy3 = -7.23f)
                moveToRelative(dx = -1.88f, dy = 10.13f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 0.56f)
                lineToRelative(dx = -0.19f, dy = -0.02f)
                lineToRelative(dx = -2.91f, dy = -0.74f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = -1.45f)
                lineToRelative(dx = 2.91f, dy = 0.74f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.55f, dy1 = 0.9f)
                moveToRelative(dx = 2.93f, dy = -3.38f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.73f, dy1 = 0.56f)
                lineToRelative(dx = -0.19f, dy = -0.02f)
                lineToRelative(dx = -4.85f, dy = -1.23f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.37f, dy1 = -1.45f)
                lineToRelative(dx = 4.85f, dy = 1.23f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.55f, dy1 = 0.9f)
            }
        }.build().also { _notepadTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _notepadTwo: ImageVector? = null
