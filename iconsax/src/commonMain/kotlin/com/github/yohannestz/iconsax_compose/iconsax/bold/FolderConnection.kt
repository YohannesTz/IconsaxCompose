package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FolderConnection: ImageVector
    get() {
        val current = _folderConnection
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FolderConnection",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.75f, y = 16.0f)
                horizontalLineToRelative(dx = 2.75f)
                curveToRelative(dx1 = 2.8f, dy1 = 0.0f, dx2 = 3.5f, dy2 = -0.7f, dx3 = 3.5f, dy3 = -3.5f)
                verticalLineTo(y = 8.3f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.8f, dx2 = -0.7f, dy2 = -3.5f, dx3 = -3.5f, dy3 = -3.5f)
                horizontalLineToRelative(dx = -2.1f)
                curveToRelative(dx1 = -0.7f, dy1 = 0.0f, dx2 = -0.85f, dy2 = -0.21f, dx3 = -1.12f, dy3 = -0.56f)
                lineToRelative(dx = -1.05f, dy = -1.4f)
                curveTo(x1 = 10.83f, y1 = 2.31f, x2 = 10.6f, y2 = 2.0f, x3 = 9.55f, y3 = 2.0f)
                horizontalLineTo(x = 8.5f)
                curveTo(x1 = 5.7f, y1 = 2.0f, x2 = 5.0f, y2 = 2.7f, x3 = 5.0f, y3 = 5.5f)
                verticalLineToRelative(dy = 7.0f)
                curveTo(x1 = 5.0f, y1 = 15.3f, x2 = 5.7f, y2 = 16.0f, x3 = 8.5f, y3 = 16.0f)
                horizontalLineToRelative(dx = 2.75f)
                verticalLineToRelative(dy = 3.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.07f, dx2 = 0.03f, dy2 = 0.14f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = 1.14f)
                quadToRelative(dx1 = -0.07f, dy1 = -0.02f, dx2 = -0.14f, dy2 = -0.03f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = 0.34f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 21.75f, x2 = 6.0f, y2 = 21.75f)
                horizontalLineToRelative(dx = 4.0f)
                quadToRelative(dx1 = 0.07f, dy1 = 0.0f, dx2 = 0.14f, dy2 = -0.03f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 3.72f, dy1 = 0.0f)
                quadToRelative(dx1 = 0.07f, dy1 = 0.02f, dx2 = 0.14f, dy2 = 0.03f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = -0.34f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = -0.75f, dx2 = -0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = -4.0f)
                quadToRelative(dx1 = -0.07f, dy1 = 0.0f, dx2 = -0.14f, dy2 = 0.03f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.14f, dy1 = -1.14f)
                quadToRelative(dx1 = 0.02f, dy1 = -0.07f, dx2 = 0.03f, dy2 = -0.14f)
                close()
            }
        }.build().also { _folderConnection = it }
    }

@Suppress("ObjectPropertyName")
private var _folderConnection: ImageVector? = null
