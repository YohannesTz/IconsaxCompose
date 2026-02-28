package com.github.yohannestz.iconsax_compose.iconsax.bulk

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
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.75f, y = 21.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.0f, y1 = 21.75f)
                horizontalLineToRelative(dx = -4.0f)
                quadToRelative(dx1 = -0.07f, dy1 = 0.0f, dx2 = -0.14f, dy2 = -0.03f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.72f, dy1 = 0.0f)
                quadToRelative(dx1 = -0.07f, dy1 = 0.02f, dx2 = -0.14f, dy2 = 0.03f)
                horizontalLineTo(x = 6.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.59f, y1 = 20.25f, x2 = 6.0f, y2 = 20.25f)
                horizontalLineToRelative(dx = 4.0f)
                quadToRelative(dx1 = 0.07f, dy1 = 0.0f, dx2 = 0.14f, dy2 = 0.03f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.14f, dy1 = -1.14f)
                quadToRelative(dx1 = -0.02f, dy1 = -0.07f, dx2 = -0.03f, dy2 = -0.14f)
                verticalLineToRelative(dy = -3.0f)
                horizontalLineToRelative(dx = 1.5f)
                verticalLineToRelative(dy = 3.0f)
                quadToRelative(dx1 = 0.0f, dy1 = 0.07f, dx2 = -0.03f, dy2 = 0.14f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.14f, dy1 = 1.14f)
                quadToRelative(dx1 = 0.07f, dy1 = -0.02f, dx2 = 0.14f, dy2 = -0.03f)
                horizontalLineToRelative(dx = 4.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 18.75f, y1 = 21.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.0f, y = 8.3f)
                verticalLineToRelative(dy = 4.2f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.8f, dx2 = -0.7f, dy2 = 3.5f, dx3 = -3.5f, dy3 = 3.5f)
                horizontalLineToRelative(dx = -7.0f)
                curveTo(x1 = 5.7f, y1 = 16.0f, x2 = 5.0f, y2 = 15.3f, x3 = 5.0f, y3 = 12.5f)
                verticalLineToRelative(dy = -7.0f)
                curveTo(x1 = 5.0f, y1 = 2.7f, x2 = 5.7f, y2 = 2.0f, x3 = 8.5f, y3 = 2.0f)
                horizontalLineToRelative(dx = 1.05f)
                curveToRelative(dx1 = 1.05f, dy1 = 0.0f, dx2 = 1.28f, dy2 = 0.31f, dx3 = 1.68f, dy3 = 0.84f)
                lineToRelative(dx = 1.05f, dy = 1.4f)
                curveTo(x1 = 12.55f, y1 = 4.59f, x2 = 12.7f, y2 = 4.8f, x3 = 13.4f, y3 = 4.8f)
                horizontalLineToRelative(dx = 2.1f)
                curveToRelative(dx1 = 2.8f, dy1 = 0.0f, dx2 = 3.5f, dy2 = 0.7f, dx3 = 3.5f, dy3 = 3.5f)
            }
        }.build().also { _folderConnection = it }
    }

@Suppress("ObjectPropertyName")
private var _folderConnection: ImageVector? = null
